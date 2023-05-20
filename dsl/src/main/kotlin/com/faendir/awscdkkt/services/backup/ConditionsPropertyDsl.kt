@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupSelection

public
    fun conditionsProperty(initializer: CfnBackupSelection.ConditionsProperty.Builder.() -> Unit):
    CfnBackupSelection.ConditionsProperty =
    CfnBackupSelection.ConditionsProperty.builder().apply(initializer).build()
