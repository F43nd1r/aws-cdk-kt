@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions

public
    fun cloudFormationRuleConstraintOptions(initializer: CloudFormationRuleConstraintOptions.Builder.() -> Unit):
    CloudFormationRuleConstraintOptions =
    CloudFormationRuleConstraintOptions.builder().apply(initializer).build()
