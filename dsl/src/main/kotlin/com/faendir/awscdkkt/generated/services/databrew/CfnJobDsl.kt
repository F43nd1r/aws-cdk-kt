package com.faendir.awscdkkt.generated.services.databrew

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJob(
  id: String,
  props: CfnJobProps,
  initializer: @AwsCdkDsl CfnJob.() -> Unit = {},
): CfnJob = CfnJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJob(id: String, initializer: @AwsCdkDsl CfnJob.Builder.() -> Unit =
    {}): CfnJob = CfnJob.Builder.create(this, id).apply(initializer).build()
