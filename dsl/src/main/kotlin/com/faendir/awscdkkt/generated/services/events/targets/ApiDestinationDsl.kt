package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.IApiDestination
import software.amazon.awscdk.services.events.targets.ApiDestination
import software.amazon.awscdk.services.events.targets.ApiDestinationProps

@Generated
public fun apiDestination(apiDestination: IApiDestination): ApiDestination =
    ApiDestination(apiDestination)

@Generated
public fun apiDestination(apiDestination: IApiDestination, props: ApiDestinationProps):
    ApiDestination = ApiDestination(apiDestination, props)

@Generated
public fun buildApiDestination(apiDestination: IApiDestination, initializer: @AwsCdkDsl
    ApiDestination.Builder.() -> Unit): ApiDestination =
    ApiDestination.Builder.create(apiDestination).apply(initializer).build()
