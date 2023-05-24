package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnConformancePackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConformancePack(id: String, props: CfnConformancePackProps):
    CfnConformancePack = CfnConformancePack(this, id, props)

@Generated
public fun Construct.cfnConformancePack(
  id: String,
  props: CfnConformancePackProps,
  initializer: @AwsCdkDsl CfnConformancePack.() -> Unit,
): CfnConformancePack = CfnConformancePack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConformancePack(id: String, initializer: @AwsCdkDsl
    CfnConformancePack.Builder.() -> Unit): CfnConformancePack =
    CfnConformancePack.Builder.create(this, id).apply(initializer).build()
