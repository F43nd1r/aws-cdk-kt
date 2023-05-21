package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig

@Generated
public fun cloudFormationTemplateConfig(initializer: CloudFormationTemplateConfig.Builder.() -> Unit
    = {}): CloudFormationTemplateConfig =
    CloudFormationTemplateConfig.builder().apply(initializer).build()
