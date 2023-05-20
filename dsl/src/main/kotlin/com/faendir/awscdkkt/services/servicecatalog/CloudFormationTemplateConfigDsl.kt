@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig

public
    fun cloudFormationTemplateConfig(initializer: CloudFormationTemplateConfig.Builder.() -> Unit):
    CloudFormationTemplateConfig = CloudFormationTemplateConfig.builder().apply(initializer).build()
