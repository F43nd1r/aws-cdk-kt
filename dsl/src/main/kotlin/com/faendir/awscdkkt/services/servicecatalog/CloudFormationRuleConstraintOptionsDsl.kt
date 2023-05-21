package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions

@Generated
public
    fun cloudFormationRuleConstraintOptions(initializer: CloudFormationRuleConstraintOptions.Builder.() -> Unit
    = {}): CloudFormationRuleConstraintOptions =
    CloudFormationRuleConstraintOptions.builder().apply(initializer).build()
