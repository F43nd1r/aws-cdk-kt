package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaRestApiProps

@Generated
public fun lambdaRestApiProps(initializer: LambdaRestApiProps.Builder.() -> Unit = {}):
    LambdaRestApiProps = LambdaRestApiProps.builder().apply(initializer).build()
