/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.engine.impl.persistence.entity;

import java.util.Date;
import java.util.List;

import org.flowable.cmmn.engine.runtime.DelegatePlanItemInstance;
import org.flowable.cmmn.model.PlanItem;
import org.flowable.engine.common.impl.persistence.entity.Entity;

/**
 * @author Joram Barrez
 */
public interface PlanItemInstanceEntity extends DelegatePlanItemInstance, Entity {
    
    void setName(String name);
    void setState(String state);
    void setCaseDefinitionId(String caseDefinitionId);
    void setCaseInstanceId(String caseInstanceId);
    void setStageInstanceId(String stageInstanceId);
    void setElementId(String elementId);
    void setStartTime(Date startTime);
    void setStartUserId(String startUserId);
    void setTenantId(String tenantId);
    
    PlanItem getPlanItem();
    
    void setChildren(List<PlanItemInstanceEntity> children);
    void addChild(PlanItemInstanceEntity planItemInstanceEntity);
    List<PlanItemInstanceEntity> getChildren();
    
    PlanItemInstanceEntity getStagePlanItemInstace();
    
}
