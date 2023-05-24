package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainName(id: String, props: CfnDomainNameProps): CfnDomainName =
    CfnDomainName(this, id, props)

@Generated
public fun Construct.cfnDomainName(
  id: String,
  props: CfnDomainNameProps,
  initializer: @AwsCdkDsl CfnDomainName.() -> Unit,
): CfnDomainName = CfnDomainName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainName(id: String, initializer: @AwsCdkDsl
    CfnDomainName.Builder.() -> Unit): CfnDomainName = CfnDomainName.Builder.create(this,
    id).apply(initializer).build()
