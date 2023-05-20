@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import software.constructs.Construct

public fun Construct.cfnApplicationReferenceDataSourceV2(
  id: String,
  props: CfnApplicationReferenceDataSourceV2Props,
  initializer: CfnApplicationReferenceDataSourceV2.() -> Unit = {},
): CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2(this, id,
    props).apply(initializer)
