package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDomainName
import software.amazon.awscdk.services.apigateway.CfnDomainNameProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainName(id: String): CfnDomainName = CfnDomainName(this, id)

@Generated
public fun Construct.cfnDomainName(id: String, initializer: @AwsCdkDsl CfnDomainName.() -> Unit):
    CfnDomainName = CfnDomainName(this, id).apply(initializer)

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
