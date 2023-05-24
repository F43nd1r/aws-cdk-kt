package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MathExpression
import software.amazon.awscdk.services.cloudwatch.MathExpressionProps

@Generated
public fun mathExpression(props: MathExpressionProps): MathExpression = MathExpression(props)

@Generated
public fun buildMathExpression(initializer: @AwsCdkDsl MathExpression.Builder.() -> Unit):
    MathExpression = MathExpression.Builder.create().apply(initializer).build()
