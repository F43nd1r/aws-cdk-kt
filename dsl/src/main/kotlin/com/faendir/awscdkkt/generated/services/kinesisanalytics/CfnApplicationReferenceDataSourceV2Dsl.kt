@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.kinesisanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 is deprecated in CDK.")
@Generated
public fun Construct.cfnApplicationReferenceDataSourceV2(
  id: String,
  props: CfnApplicationReferenceDataSourceV2Props,
  initializer: @AwsCdkDsl CfnApplicationReferenceDataSourceV2.() -> Unit = {},
): CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 is deprecated in CDK.")
@Generated
public fun Construct.buildCfnApplicationReferenceDataSourceV2(id: String, initializer: @AwsCdkDsl CfnApplicationReferenceDataSourceV2.Builder.() -> Unit = {}): CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2.Builder.create(this, id).apply(initializer).build()
