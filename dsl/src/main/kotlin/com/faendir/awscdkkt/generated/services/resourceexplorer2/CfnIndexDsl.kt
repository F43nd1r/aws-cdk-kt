package com.faendir.awscdkkt.generated.services.resourceexplorer2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIndex(id: String, props: CfnIndexProps): CfnIndex = CfnIndex(this, id,
    props)

@Generated
public fun Construct.cfnIndex(
  id: String,
  props: CfnIndexProps,
  initializer: @AwsCdkDsl CfnIndex.() -> Unit,
): CfnIndex = CfnIndex(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIndex(id: String, initializer: @AwsCdkDsl CfnIndex.Builder.() -> Unit):
    CfnIndex = CfnIndex.Builder.create(this, id).apply(initializer).build()
