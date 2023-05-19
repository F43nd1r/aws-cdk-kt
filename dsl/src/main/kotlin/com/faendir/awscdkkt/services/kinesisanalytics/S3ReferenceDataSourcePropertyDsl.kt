@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

public
    fun s3ReferenceDataSourceProperty(initializer: CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.() -> Unit):
    CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty =
    CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder().apply(initializer).build()
