/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import persistencias.CivDetalleProcesojuridico;

/**
 *
 * @author Admin
 */
public class DaoDetalleProcesosJuridicos extends HibernateDaoSupport implements ITDetalleProcesosJuridicos {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public long insert(CivDetalleProcesojuridico civDetalleProcesojuridico) throws Exception {
        return Long.parseLong(getHibernateTemplate().save(civDetalleProcesojuridico).toString());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean update(CivDetalleProcesojuridico civDetalleProcesojuridico) throws Exception {
        getHibernateTemplate().update(civDetalleProcesojuridico);
        return true;
    }

    @Override
    public CivDetalleProcesojuridico getConcepto(int detprojuId) throws Exception {
        String hql = "from CivConceptos where detprojuId=:detprojuId";
        List list = getHibernateTemplate().findByNamedParam(hql, "detprojuId", new BigDecimal(detprojuId));
        if (list.size() > 0) {
            return (CivDetalleProcesojuridico) list.get(0);
        }
        return null;
    }

}
