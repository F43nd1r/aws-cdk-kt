package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun retentionArchiveTierProperty(initializer: CfnLifecyclePolicy.RetentionArchiveTierProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.RetentionArchiveTierProperty =
    CfnLifecyclePolicy.RetentionArchiveTierProperty.builder().apply(initializer).build()
