package com.faendir.awscdkkt.generated.interfaces.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.lambda.FunctionReference

@Generated
public fun buildFunctionReference(initializer: @AwsCdkDsl FunctionReference.Builder.() -> Unit = {}): FunctionReference = FunctionReference.Builder().apply(initializer).build()
