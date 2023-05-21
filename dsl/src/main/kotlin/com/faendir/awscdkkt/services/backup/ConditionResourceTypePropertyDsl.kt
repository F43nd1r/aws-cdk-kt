package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection

@Generated
public
    fun conditionResourceTypeProperty(initializer: CfnBackupSelection.ConditionResourceTypeProperty.Builder.() -> Unit
    = {}): CfnBackupSelection.ConditionResourceTypeProperty =
    CfnBackupSelection.ConditionResourceTypeProperty.builder().apply(initializer).build()
