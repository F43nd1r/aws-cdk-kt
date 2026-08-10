package com.faendir.awscdkkt.generated.services.auditmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessmentFramework
import software.amazon.awscdk.services.auditmanager.CfnAssessmentFrameworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssessmentFramework(
  id: String,
  props: CfnAssessmentFrameworkProps,
  initializer: @AwsCdkDsl CfnAssessmentFramework.() -> Unit = {},
): CfnAssessmentFramework = CfnAssessmentFramework(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssessmentFramework(id: String, initializer: @AwsCdkDsl CfnAssessmentFramework.Builder.() -> Unit = {}): CfnAssessmentFramework = CfnAssessmentFramework.Builder.create(this, id).apply(initializer).build()
