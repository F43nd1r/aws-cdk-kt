package com.faendir.awscdkkt.generated.services.evidently

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnFeature
import software.amazon.awscdk.services.evidently.CfnFeatureProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFeature(id: String, props: CfnFeatureProps): CfnFeature = CfnFeature(this,
    id, props)

@Generated
public fun Construct.cfnFeature(
  id: String,
  props: CfnFeatureProps,
  initializer: @AwsCdkDsl CfnFeature.() -> Unit,
): CfnFeature = CfnFeature(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFeature(id: String, initializer: @AwsCdkDsl
    CfnFeature.Builder.() -> Unit): CfnFeature = CfnFeature.Builder.create(this,
    id).apply(initializer).build()
