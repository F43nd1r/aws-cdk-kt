package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.iam.PolicyStatementProps

@Generated
public fun policyStatement(props: PolicyStatementProps): PolicyStatement = PolicyStatement(props)

@Generated
public fun policyStatement(): PolicyStatement = PolicyStatement()

@Generated
public fun buildPolicyStatement(initializer: @AwsCdkDsl PolicyStatement.Builder.() -> Unit):
    PolicyStatement = PolicyStatement.Builder.create().apply(initializer).build()
