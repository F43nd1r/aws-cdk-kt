package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate
import software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepositoryCreationTemplate(
  id: String,
  props: CfnRepositoryCreationTemplateProps,
  initializer: @AwsCdkDsl CfnRepositoryCreationTemplate.() -> Unit = {},
): CfnRepositoryCreationTemplate = CfnRepositoryCreationTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRepositoryCreationTemplate(id: String, initializer: @AwsCdkDsl
    CfnRepositoryCreationTemplate.Builder.() -> Unit = {}): CfnRepositoryCreationTemplate =
    CfnRepositoryCreationTemplate.Builder.create(this, id).apply(initializer).build()
