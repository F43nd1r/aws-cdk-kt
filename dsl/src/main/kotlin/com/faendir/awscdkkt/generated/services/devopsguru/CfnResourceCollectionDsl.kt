package com.faendir.awscdkkt.generated.services.devopsguru

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceCollection(
  id: String,
  props: CfnResourceCollectionProps,
  initializer: @AwsCdkDsl CfnResourceCollection.() -> Unit = {},
): CfnResourceCollection = CfnResourceCollection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceCollection(id: String, initializer: @AwsCdkDsl
    CfnResourceCollection.Builder.() -> Unit = {}): CfnResourceCollection =
    CfnResourceCollection.Builder.create(this, id).apply(initializer).build()
