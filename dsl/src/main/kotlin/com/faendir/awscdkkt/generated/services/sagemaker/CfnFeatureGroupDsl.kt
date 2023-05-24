package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFeatureGroup(id: String, props: CfnFeatureGroupProps): CfnFeatureGroup =
    CfnFeatureGroup(this, id, props)

@Generated
public fun Construct.cfnFeatureGroup(
  id: String,
  props: CfnFeatureGroupProps,
  initializer: @AwsCdkDsl CfnFeatureGroup.() -> Unit,
): CfnFeatureGroup = CfnFeatureGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFeatureGroup(id: String, initializer: @AwsCdkDsl
    CfnFeatureGroup.Builder.() -> Unit): CfnFeatureGroup = CfnFeatureGroup.Builder.create(this,
    id).apply(initializer).build()
