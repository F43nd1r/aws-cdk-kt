package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.amazon.awscdk.services.sagemaker.CfnDomainProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomain(
  id: String,
  props: CfnDomainProps,
  initializer: @AwsCdkDsl CfnDomain.() -> Unit = {},
): CfnDomain = CfnDomain(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomain(id: String, initializer: @AwsCdkDsl CfnDomain.Builder.() -> Unit
    = {}): CfnDomain = CfnDomain.Builder.create(this, id).apply(initializer).build()
