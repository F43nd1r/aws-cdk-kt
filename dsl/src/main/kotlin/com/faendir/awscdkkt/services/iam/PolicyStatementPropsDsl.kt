package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.PolicyStatementProps

@Generated
public fun policyStatementProps(initializer: PolicyStatementProps.Builder.() -> Unit = {}):
    PolicyStatementProps = PolicyStatementProps.builder().apply(initializer).build()
