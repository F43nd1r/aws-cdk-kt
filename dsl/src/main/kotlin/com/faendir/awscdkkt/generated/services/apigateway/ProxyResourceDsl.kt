package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceProps
import software.constructs.Construct

@Generated
public fun Construct.proxyResource(
  id: String,
  props: ProxyResourceProps,
  initializer: @AwsCdkDsl ProxyResource.() -> Unit = {},
): ProxyResource = ProxyResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildProxyResource(id: String, initializer: @AwsCdkDsl ProxyResource.Builder.() -> Unit = {}): ProxyResource = ProxyResource.Builder.create(this, id).apply(initializer).build()
