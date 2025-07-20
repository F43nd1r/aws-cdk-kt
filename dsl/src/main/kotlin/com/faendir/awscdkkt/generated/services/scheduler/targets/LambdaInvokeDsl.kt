package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.scheduler.targets.LambdaInvoke

@Generated
public fun buildLambdaInvoke(func: IFunction, initializer: @AwsCdkDsl LambdaInvoke.Builder.() -> Unit = {}): LambdaInvoke = LambdaInvoke.Builder.create(func).apply(initializer).build()
