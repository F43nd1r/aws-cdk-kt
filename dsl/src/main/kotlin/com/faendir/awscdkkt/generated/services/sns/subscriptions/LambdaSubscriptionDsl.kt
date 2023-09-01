package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription

@Generated
public fun buildLambdaSubscription(fn: IFunction, initializer: @AwsCdkDsl
    LambdaSubscription.Builder.() -> Unit = {}): LambdaSubscription =
    LambdaSubscription.Builder.create(fn).apply(initializer).build()
