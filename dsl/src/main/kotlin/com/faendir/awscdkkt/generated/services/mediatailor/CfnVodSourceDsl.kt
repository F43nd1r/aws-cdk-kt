package com.faendir.awscdkkt.generated.services.mediatailor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnVodSource
import software.amazon.awscdk.services.mediatailor.CfnVodSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVodSource(id: String, props: CfnVodSourceProps): CfnVodSource =
    CfnVodSource(this, id, props)

@Generated
public fun Construct.cfnVodSource(
  id: String,
  props: CfnVodSourceProps,
  initializer: @AwsCdkDsl CfnVodSource.() -> Unit,
): CfnVodSource = CfnVodSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVodSource(id: String, initializer: @AwsCdkDsl
    CfnVodSource.Builder.() -> Unit): CfnVodSource = CfnVodSource.Builder.create(this,
    id).apply(initializer).build()
