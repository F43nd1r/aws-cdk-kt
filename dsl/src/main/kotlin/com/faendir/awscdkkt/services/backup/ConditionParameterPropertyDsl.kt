package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection

@Generated
public
    fun conditionParameterProperty(initializer: CfnBackupSelection.ConditionParameterProperty.Builder.() -> Unit
    = {}): CfnBackupSelection.ConditionParameterProperty =
    CfnBackupSelection.ConditionParameterProperty.builder().apply(initializer).build()
