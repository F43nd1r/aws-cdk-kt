package com.faendir.awscdkkt.generated.services.auditmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@Generated
public fun buildScopeProperty(initializer: @AwsCdkDsl CfnAssessment.ScopeProperty.Builder.() -> Unit
    = {}): CfnAssessment.ScopeProperty =
    CfnAssessment.ScopeProperty.Builder().apply(initializer).build()
