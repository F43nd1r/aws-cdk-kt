@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

public
    fun csvOutputOptionsProperty(initializer: CfnJob.CsvOutputOptionsProperty.Builder.() -> Unit):
    CfnJob.CsvOutputOptionsProperty =
    CfnJob.CsvOutputOptionsProperty.builder().apply(initializer).build()
