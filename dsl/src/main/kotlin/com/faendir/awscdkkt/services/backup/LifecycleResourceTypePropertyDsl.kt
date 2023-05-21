package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan

@Generated
public
    fun lifecycleResourceTypeProperty(initializer: CfnBackupPlan.LifecycleResourceTypeProperty.Builder.() -> Unit
    = {}): CfnBackupPlan.LifecycleResourceTypeProperty =
    CfnBackupPlan.LifecycleResourceTypeProperty.builder().apply(initializer).build()
