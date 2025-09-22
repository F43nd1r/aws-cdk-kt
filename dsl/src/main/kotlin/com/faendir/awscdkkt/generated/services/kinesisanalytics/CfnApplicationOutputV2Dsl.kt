@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.kinesisanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 is deprecated in CDK.")
@Generated
public fun Construct.cfnApplicationOutputV2(
  id: String,
  props: CfnApplicationOutputV2Props,
  initializer: @AwsCdkDsl CfnApplicationOutputV2.() -> Unit = {},
): CfnApplicationOutputV2 = CfnApplicationOutputV2(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 is deprecated in CDK.")
@Generated
public fun Construct.buildCfnApplicationOutputV2(id: String, initializer: @AwsCdkDsl CfnApplicationOutputV2.Builder.() -> Unit = {}): CfnApplicationOutputV2 = CfnApplicationOutputV2.Builder.create(this, id).apply(initializer).build()
