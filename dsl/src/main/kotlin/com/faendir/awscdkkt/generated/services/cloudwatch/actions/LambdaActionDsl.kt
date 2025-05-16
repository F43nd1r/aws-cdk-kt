package com.faendir.awscdkkt.generated.services.cloudwatch.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.actions.LambdaAction

@Generated
public fun buildLambdaAction(lambdaFunction: Any, initializer: @AwsCdkDsl
    LambdaAction.Builder.() -> Unit = {}): LambdaAction =
    LambdaAction.Builder.create(lambdaFunction).apply(initializer).build()
