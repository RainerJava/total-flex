
package com.passos.model.entidade.commandquery;

import com.passos.model.entidade.EntidadeBase;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author clayton
 */
@Local
public interface ICommandLocal {

    public void execute(Map<ECommand, EntidadeBase> map);
}
