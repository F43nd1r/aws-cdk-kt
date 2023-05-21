package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps

@Generated
public fun lambdaApplicationProps(initializer: LambdaApplicationProps.Builder.() -> Unit = {}):
    LambdaApplicationProps = LambdaApplicationProps.builder().apply(initializer).build()
