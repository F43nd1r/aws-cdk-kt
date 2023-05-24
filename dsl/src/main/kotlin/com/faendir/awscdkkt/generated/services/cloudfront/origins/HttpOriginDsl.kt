package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps

@Generated
public fun httpOrigin(domainName: String): HttpOrigin = HttpOrigin(domainName)

@Generated
public fun httpOrigin(domainName: String, props: HttpOriginProps): HttpOrigin =
    HttpOrigin(domainName, props)

@Generated
public fun buildHttpOrigin(domainName: String, initializer: @AwsCdkDsl
    HttpOrigin.Builder.() -> Unit): HttpOrigin =
    HttpOrigin.Builder.create(domainName).apply(initializer).build()
