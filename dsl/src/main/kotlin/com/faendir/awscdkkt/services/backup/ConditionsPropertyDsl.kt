package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection

@Generated
public fun conditionsProperty(initializer: CfnBackupSelection.ConditionsProperty.Builder.() -> Unit
    = {}): CfnBackupSelection.ConditionsProperty =
    CfnBackupSelection.ConditionsProperty.builder().apply(initializer).build()
