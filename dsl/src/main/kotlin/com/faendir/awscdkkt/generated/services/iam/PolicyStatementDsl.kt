package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.PolicyStatement

@Generated
public fun buildPolicyStatement(initializer: @AwsCdkDsl PolicyStatement.Builder.() -> Unit = {}):
    PolicyStatement = PolicyStatement.Builder.create().apply(initializer).build()
