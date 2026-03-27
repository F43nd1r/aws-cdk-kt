package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnQuotaShare
import software.amazon.awscdk.services.batch.CfnQuotaShareProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQuotaShare(
  id: String,
  props: CfnQuotaShareProps,
  initializer: @AwsCdkDsl CfnQuotaShare.() -> Unit = {},
): CfnQuotaShare = CfnQuotaShare(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQuotaShare(id: String, initializer: @AwsCdkDsl CfnQuotaShare.Builder.() -> Unit = {}): CfnQuotaShare = CfnQuotaShare.Builder.create(this, id).apply(initializer).build()
