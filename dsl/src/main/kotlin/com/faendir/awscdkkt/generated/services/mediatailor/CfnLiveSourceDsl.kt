package com.faendir.awscdkkt.generated.services.mediatailor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnLiveSource
import software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLiveSource(id: String, props: CfnLiveSourceProps): CfnLiveSource =
    CfnLiveSource(this, id, props)

@Generated
public fun Construct.cfnLiveSource(
  id: String,
  props: CfnLiveSourceProps,
  initializer: @AwsCdkDsl CfnLiveSource.() -> Unit,
): CfnLiveSource = CfnLiveSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLiveSource(id: String, initializer: @AwsCdkDsl
    CfnLiveSource.Builder.() -> Unit): CfnLiveSource = CfnLiveSource.Builder.create(this,
    id).apply(initializer).build()
