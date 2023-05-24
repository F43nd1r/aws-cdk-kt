package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import software.amazon.awscdk.CliCredentialsStackSynthesizerProps

@Generated
public fun cliCredentialsStackSynthesizer(props: CliCredentialsStackSynthesizerProps):
    CliCredentialsStackSynthesizer = CliCredentialsStackSynthesizer(props)

@Generated
public fun cliCredentialsStackSynthesizer(): CliCredentialsStackSynthesizer =
    CliCredentialsStackSynthesizer()

@Generated
public fun buildCliCredentialsStackSynthesizer(initializer: @AwsCdkDsl
    CliCredentialsStackSynthesizer.Builder.() -> Unit): CliCredentialsStackSynthesizer =
    CliCredentialsStackSynthesizer.Builder.create().apply(initializer).build()
