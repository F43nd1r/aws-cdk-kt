package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.DomainName
import software.amazon.awscdk.services.apigatewayv2.DomainNameProps
import software.constructs.Construct

@Generated
public fun Construct.domainName(
  id: String,
  props: DomainNameProps,
  initializer: @AwsCdkDsl DomainName.() -> Unit = {},
): DomainName = DomainName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDomainName(id: String, initializer: @AwsCdkDsl DomainName.Builder.() -> Unit = {}): DomainName = DomainName.Builder.create(this, id).apply(initializer).build()
