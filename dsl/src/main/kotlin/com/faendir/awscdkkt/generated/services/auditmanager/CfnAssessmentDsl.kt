package com.faendir.awscdkkt.generated.services.auditmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssessment(id: String, initializer: @AwsCdkDsl CfnAssessment.() -> Unit =
    {}): CfnAssessment = CfnAssessment(this, id).apply(initializer)

@Generated
public fun Construct.cfnAssessment(
  id: String,
  props: CfnAssessmentProps,
  initializer: @AwsCdkDsl CfnAssessment.() -> Unit = {},
): CfnAssessment = CfnAssessment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssessment(id: String, initializer: @AwsCdkDsl
    CfnAssessment.Builder.() -> Unit = {}): CfnAssessment = CfnAssessment.Builder.create(this,
    id).apply(initializer).build()
