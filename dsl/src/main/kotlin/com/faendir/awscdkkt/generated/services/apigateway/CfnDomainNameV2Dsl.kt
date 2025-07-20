package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDomainNameV2
import software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainNameV2(id: String, initializer: @AwsCdkDsl CfnDomainNameV2.() -> Unit = {}): CfnDomainNameV2 = CfnDomainNameV2(this, id).apply(initializer)

@Generated
public fun Construct.cfnDomainNameV2(
  id: String,
  props: CfnDomainNameV2Props,
  initializer: @AwsCdkDsl CfnDomainNameV2.() -> Unit = {},
): CfnDomainNameV2 = CfnDomainNameV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainNameV2(id: String, initializer: @AwsCdkDsl CfnDomainNameV2.Builder.() -> Unit = {}): CfnDomainNameV2 = CfnDomainNameV2.Builder.create(this, id).apply(initializer).build()
