@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

public
    fun s3TableOutputOptionsProperty(initializer: CfnJob.S3TableOutputOptionsProperty.Builder.() -> Unit):
    CfnJob.S3TableOutputOptionsProperty =
    CfnJob.S3TableOutputOptionsProperty.builder().apply(initializer).build()
