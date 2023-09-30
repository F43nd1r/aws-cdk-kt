package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnOutpostResolver
import software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOutpostResolver(
  id: String,
  props: CfnOutpostResolverProps,
  initializer: @AwsCdkDsl CfnOutpostResolver.() -> Unit = {},
): CfnOutpostResolver = CfnOutpostResolver(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOutpostResolver(id: String, initializer: @AwsCdkDsl
    CfnOutpostResolver.Builder.() -> Unit = {}): CfnOutpostResolver =
    CfnOutpostResolver.Builder.create(this, id).apply(initializer).build()
