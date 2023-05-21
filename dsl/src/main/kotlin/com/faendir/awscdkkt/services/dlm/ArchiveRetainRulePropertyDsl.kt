package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public
    fun archiveRetainRuleProperty(initializer: CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder.() -> Unit
    = {}): CfnLifecyclePolicy.ArchiveRetainRuleProperty =
    CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder().apply(initializer).build()
