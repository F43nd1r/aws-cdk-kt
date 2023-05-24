package com.faendir.awscdkkt.generated.services.fis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExperimentTemplate(id: String, props: CfnExperimentTemplateProps):
    CfnExperimentTemplate = CfnExperimentTemplate(this, id, props)

@Generated
public fun Construct.cfnExperimentTemplate(
  id: String,
  props: CfnExperimentTemplateProps,
  initializer: @AwsCdkDsl CfnExperimentTemplate.() -> Unit,
): CfnExperimentTemplate = CfnExperimentTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExperimentTemplate(id: String, initializer: @AwsCdkDsl
    CfnExperimentTemplate.Builder.() -> Unit): CfnExperimentTemplate =
    CfnExperimentTemplate.Builder.create(this, id).apply(initializer).build()
